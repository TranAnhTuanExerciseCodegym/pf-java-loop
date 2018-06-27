package OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BuildClassStopWatch {
    private long startTime;
    private long endTime;

    public BuildClassStopWatch() {
    }

    public void start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        BuildClassStopWatch buildClassStopWatch = new BuildClassStopWatch();
        buildClassStopWatch.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("start: ");
        int start = scanner.nextInt();
        System.out.println("end: ");
        int end = scanner.nextInt();


        buildClassStopWatch.stop();

        System.out.println(buildClassStopWatch.getElapsedTime());
    }

//    public static void main(String[] args) {
//        Date thoiGian = new Date();
//
//        //Khai bao dinh dang ngay thang
//        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
//
//        //parse ngay thang sang dinh dang va chuyen thanh string.
//        String showTime = dinhDangThoiGian.format(thoiGian.getTime());
//
//        System.out.println("" + showTime);
//    }
}
