public class Main {
    public static void main(String[] args) {
        float roomLengthM = 15f ; //требуется ввести длину комнаты в метрах
        float roomWidthM = 6f; //требуется ввести ширину комнаты в метрах
        float roomHeight = 2 ;//требуется ввести высоту комнаты в метрах
        float rollWidthM = 7f;//требуется ввести ширину рулона обоев
        float rollLenghM= 5f; //требуется ввести длину рулона в метрах
        float roomPerimeterM = roomLengthM*roomWidthM;
        float numberOfPieces =  rollLenghM%roomHeight;
        System.out.println(numberOfPieces);

    }
}
