/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;
import java.util.Random;

/**
 *
 * @author dania
 */
public class TaskArray2D {
    public static void main(String[] args) {
        System.out.println("Task Array 2 Dimension");
        System.out.println("----------------------");
        int manyStudent = 3;
        int manyStudy = 5;
        int student[][] = new int[manyStudent][manyStudy];
        char gradeStudent[][] = new char[manyStudent][manyStudy];
        String[] studies = {"Bahasa Inggris","Bahasa Indonesia","Matematika","Atol","Algoritma"}; 
        
        // create instance of Random class
        Random rand = new Random();
        
        // 1 input grade student index ke 0;
        student[0][0] = rand.nextInt(100);
        student[0][1] = rand.nextInt(100);
        student[0][2] = rand.nextInt(100);
        student[0][3] = rand.nextInt(100);
        student[0][4] = rand.nextInt(100);
        
        // 1 input grade student index ke 1;
        student[1][0] = rand.nextInt(100);
        student[1][1] = rand.nextInt(100);
        student[1][2] = rand.nextInt(100);
        student[1][3] = rand.nextInt(100);
        student[1][4] = rand.nextInt(100);
        
        // 1 input grade student index ke 2;
        student[2][0] = rand.nextInt(100);
        student[2][1] = rand.nextInt(100);
        student[2][2] = rand.nextInt(100);
        student[2][3] = rand.nextInt(100);
        student[2][4] = rand.nextInt(100);

        // 2 check namanya nilai untuk mendapatkan index
        for (int i = 0; i < manyStudent; i++) {
            for (int j = 0; j < manyStudy; j++) {
                if(student[i][j] > 85){
                    gradeStudent[i][j] = 'A';
                }else if(student[i][j] > 70 && student[i][j] <= 85){
                    gradeStudent[i][j] = 'B';
                }else if(student[i][j] > 60 && student[i][j] <= 70){
                    gradeStudent[i][j] = 'C';
                }else if(student[i][j] > 50 && student[i][j] <= 60){
                    gradeStudent[i][j] = 'D';
                }else if(student[i][j] <= 50){
                    gradeStudent[i][j] = 'E';
                }
                // lanjutin sendiri
            }
        }

        // 3 check nilai masing index per mahasiwa mengunakan switch case
        for (int i = 0; i < manyStudent; i++) {
            System.out.println("Mahasiswa Ke : " + (i));
            for (int j = 0; j < manyStudy; j++) {
                System.out.print(studies[j] + " : [" + student[i][j] + " : " +gradeStudent[i][j]+ "]- ");
                switch (gradeStudent[i][j]) {
                    case 'A':
                        System.out.println("Lulus dengan Sangat Baik.");
                        break;
                    case 'B':
                        System.out.println("Lulus dengan Baik.");
                        break;
                    case 'C':
                        System.out.println("Lulus dengan Cukup.");
                        break;
                    case 'D':
                        System.out.println("Lulus dengan Kurang.");
                        break;
                    case 'E':
                        System.out.println("Tidak Lulus Maaf.");
                        break;
                    default:
                        System.out.println("Error System.");
                }
            }
            System.out.println("");
        }
        
        // 4 check rata2 nilai masing2 mahasiswa;
        double totalNilai = 0;
        System.out.println("Rata Rata Nilai :");
        for (int i = 0; i < manyStudent; i++) {
            for (int j = 0; j < manyStudy; j++) {
                totalNilai = totalNilai + student[i][j];
            }
            System.out.println("Mahasiswa Ke - " + i + " : " + (totalNilai/manyStudy));
            totalNilai = 0;
        }
    }//Last Line 
}
