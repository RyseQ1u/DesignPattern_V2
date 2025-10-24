package com.ryse.designpattern._15_Facade.Maker;

import java.io.IOException;
import java.io.Writer;

class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    /// 输出标题
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" +title +"</h1>\n");
    }

    /// 输出段落
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n");
    }

    /// 输出超链接
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\""+href +"\">" + caption + "</a>");
    }

    /// 输出邮件地址
    public void mailto(String mailaddr, String username)throws IOException {//输出邮件地址
        link("mailto:" + mailaddr, username);
    }

    /// 输出邮件地址
    public void listmailto(String mailaddr, String username)throws IOException {//输出邮件地址
        link("mailto:" + mailaddr, username);
    }

    /// 结束 输出HTML
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
