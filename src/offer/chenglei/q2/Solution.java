package offer.chenglei.q2;

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
