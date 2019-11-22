package com.zjw.utils.XMLUtil;

/**
 * @auther 张计委
 * @description
 * @date
 */
public class XmlStringer {
    public XmlStringer() {
        builder=new StringBuilder();
    }

    private StringBuilder builder;
    public XmlStringer startNode(String name){
        builder.append("<"+name+">");
        return this;
    }
    public XmlStringer endNode(String name){
        builder.append("</"+name+">");
        return this;
    }
    public XmlStringer attribute(String name,String value){
        builder.replace(builder.length()-1, builder.length(), " "+name+"='"+value+"'>");
        return this;
    }
    public XmlStringer attribute(String name,int value){
        builder.replace(builder.length()-1, builder.length(), " "+name+"='"+value+"'>");
        return this;
    }

    public XmlStringer text(String text){
        builder.append(text);
        return this;
    }
    public XmlStringer text(int text){
        builder.append(text);
        return this;
    }
    public XmlStringer text(boolean text){
        builder.append(text);
        return this;
    }
    public XmlStringer text(byte[] data) {
        builder.append(new String(data));
        return this;

    }
    public void clear(){
        builder.delete(0, builder.length());
    }
    @Override
    public String toString() {
        return builder.toString();
    }
}

