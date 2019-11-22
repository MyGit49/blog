package com.zjw.utils.XMLUtil;

/**
 * @auther 张计委
 * @description
 * @date
 */
public class XMLTest {
    public static void main(String[] args) {
        XmlStringer stringer=new XmlStringer();
        stringer.startNode("tobacco");
        stringer.attribute("action", "tasksave");
        stringer.attribute("taskid", "000000000018878");
        stringer.startNode("taskstatus");
        stringer.text("2");
        stringer.endNode("taskstatus");


        stringer.startNode("subtask");
        stringer.attribute("subtaskid", "77777777777");
        stringer.attribute("subtaskstatus", "9");
        stringer.attribute("type", "m2_0");

        stringer.startNode("biaozhun");

        stringer.startNode("appraise");

        stringer.startNode("selected_index");
        stringer.text("0");
        stringer.endNode("selected_index");

        stringer.startNode("comment");
        stringer.text(1);
        stringer.endNode("comment");

        stringer.endNode("appraise");

        stringer.endNode("biaozhun");



        stringer.endNode("subtask");

        stringer.endNode("tobacco");
        System.out.println(stringer.toString());
    }
}
