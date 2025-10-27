package com.ryse.designpattern._18_Memento;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MementoMain {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(2);
        Memento memento = null;

        try {
            boolean exists =Files.exists(Paths.get("1_output/saveData.txt"));
            if (exists) {
                memento = gamer.loadMementoFromFile(Paths.get("1_output/saveData.txt").toString());
                gamer.restoreMemento(memento);
            } else {
                memento = gamer.createMemento();
                gamer.saveMementoToFile(Paths.get("1_output/saveData.txt").toString());
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("==== " + i);
                System.out.println("现状：" + gamer);

                gamer.bet();

                System.out.println("所持金钱为：" + gamer.getMoney() + "元");

                if (gamer.getMoney() > memento.getMoney()) {
                    System.out.println("（所持金钱增加了，保存游戏状态）");
//                memento = gamer.createMemento();
                    gamer.saveMementoToFile(Paths.get("1_output/saveData.txt").toString());
                } else if (gamer.getMoney() < memento.getMoney() / 2) {
                    System.out.println("（所持金钱減少了，恢复到以前的状态）");
//                gamer.restoreMemento(memento);
                    gamer.restoreFromFile(Paths.get("1_output/saveData.txt").toString());
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断目录是否包含名为 "saveData" 的文件，或以 "saveData" 为前缀的文件。
     */
    public static boolean hasSaveData(Path dir) throws IOException {
        if (dir == null || !Files.exists(dir) || !Files.isDirectory(dir)) {
            return false;
        }
        // 精确匹配
        Path exact = dir.resolve("saveData");
        if (Files.exists(exact) && Files.isRegularFile(exact)) {
            return true;
        }
        // 前缀匹配（使用 glob）
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "saveData*")) {
            for (Path p : ds) {
                if (Files.isRegularFile(p)) {
                    return true;
                }
            }
        }
        return false;
    }
}
