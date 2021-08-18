class AllTheColorsOfRainbow
{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue)
    {
        anIntegerRepresentingColors = newHue;
    }
}
class Practice
{
    public static void main(String[] args)
    {
        AllTheColorsOfRainbow color = new AllTheColorsOfRainbow();
        color.changeTheHueOfTheColor(100);
        System.out.println("Hue = " + color.anIntegerRepresentingColors);
    }
}
