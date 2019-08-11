package offer.chenglei.q2;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

class Solution {

    String replaceSpace(StringBuffer str) {
        if (str == null) {
            return "";
        }
        if (str.length() == 0) {
            return str.toString();
        }

        return str.toString().replaceAll(" ", "%20");
    }
}
