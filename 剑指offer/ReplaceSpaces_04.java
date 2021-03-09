package 剑指offer;
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
//思路：1.先调用toString 将StingBuffer 变为String 类型 再调用String中 replaceAll 方法
//
// 思路2. 创建一个StringBuilder对象（存储新字符串的容器）,然后遍历StringBuffer每个字符，
// 然后是空格就往StringBuilder对象里添加想要替换的字符串,如果没有的话 就把这个字符添加到StringBuilder对象中 ，
// 最后将对象变为String类型即可

public class ReplaceSpaces_04 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are pig");
        ReplaceSpaces_04 replaceSpaces_04 = new ReplaceSpaces_04();
        System.out.println(replaceSpaces_04.replaceSpace(str));
        replaceSpaces_04.replaceSpace1(str);
    }

    private String replaceSpace1(StringBuffer str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c==' '){
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
