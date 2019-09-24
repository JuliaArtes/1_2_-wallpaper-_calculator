public class Main {
    public static void main(String[] args) {
        int roomLengthSm = 500;
        int roomWidthSm = 600;
        int roomHeightSm = 220;
        int rollWidthSm = 70;
        int rollLenghSm = 1000;
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
