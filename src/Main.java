public class Main {
    public static void main(String[] args) {
        int roomLengthSm = 500; // enter the length of the room incentimeters
        int roomWidthSm = 600; // enter the width of the room in centimeters
        int roomHeightSm = 220;//  enter the height of the room in centimeters
        int rollWidthSm = 70;//enter the wallpaper width  in centimeters
        int rollLenghSm = 1000; //enterthe roll length in centimeters
        int roomPerimeterSm = 2 * (roomLengthSm + roomWidthSm);
        int numberOfPiecesInRoll = rollLenghSm / roomHeightSm;
        int numberOfPiecesOnRoom = roomPerimeterSm / rollWidthSm;
        int numberOfRoll= (numberOfPiecesOnRoom+1)/numberOfPiecesInRoll+1;
        System.out.println("Периметр  "+roomPerimeterSm);
        System.out.println("Число кусков на комнату  "+numberOfPiecesOnRoom);
        System.out.println("Число кусков в рулоне  "+numberOfPiecesInRoll);
        System.out.println("Необходимое количество рулонов  "+numberOfRoll);
     }
}
