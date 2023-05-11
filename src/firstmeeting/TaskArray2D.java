/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

/**
 *
 * @author dania
 */
public class TaskArray2D {
    public static void main(String[] args) {
        System.out.println("Task Array 2 Dimension");
        int manyStudent = 3;
        int manyStudy = 5;
        int student[][] = new int[manyStudent][manyStudy];
        char gradeStudent[][] = new char[manyStudent][manyStudy];
        // index 0 d2 = nilai bahasa ingris 
        // index 1 d2 = nilai bahasa indonesia
        // index 2 d2 = nilai matematika
        // index 3 d2 = nilai atol
        // index 4 d2 = nilai algoritma
        // 1 msukan nilai ke student index ke 0;
        student[0][0] = 50;
        student[0][1] = 70;
        student[0][2] = 80;
        student[0][3] = 90;
        student[0][4] = 100;

        // 2 check namanya nilai untuk mendapatkan index
        for (int i = 0; i < manyStudent; i++) {
            for (int j = 0; j < manyStudy; j++) {
                if (student[i][j] > 85) {
                    gradeStudent[i][j] = 'a';
                }

                // lanjutin sendiri
            }
        }

        // 3 check nilai masing index per mahasiwa mengunakan switch case
        for (int i = 0; i < manyStudent; i++) {
            for (int j = 0; j < manyStudy; j++) {
                switch (gradeStudent[i][j]) {
                    case 'A':
                        System.out.println("anda lulus dengans sangan memuasakan");
                        break;
                }

                // lanjut sendiri
                // kasih defult kluarkan informasi index error
                
            }
        }
        
        // 4 check rata2 nilai masing2 mahasiswa;
        int totalNilai = 0;
        for (int i = 0; i < manyStudent; i++) {
            for (int j = 0; j < manyStudy; j++) {

                totalNilai = totalNilai + gradeStudent[i][j];
                // kasih logic untuk menghitung rata2 nilai
                // di output

            }

        }
        
    }
}
