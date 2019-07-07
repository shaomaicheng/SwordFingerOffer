package offer.chenglei.q1;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        boolean find = solution.Find(7, array);
        System.out.println(find);
    }
}

