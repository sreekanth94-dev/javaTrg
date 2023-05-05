
public class MultiDimensionArray {
    public static void main(String[] args) {
        int student[][] = {
            {10,20,30},
            {30,40,50},
            {50,60,70},
            {70,80,90}
        };

        // marks of 3rd std
        // for (int i : student[2]){
        //     System.out.println(i);
        // }

        // avg of sub1
        int sub1Total = 0;
        for (int i=0;i<student.length;i++){
            sub1Total += student[i][0];
        }
        System.out.println(sub1Total/4);

        //avg marks of a student
        int stdMarksAvg = 0;
        for (int j : student[0]){
            stdMarksAvg += j;
        }
        System.out.println(stdMarksAvg/3);



    }
}
