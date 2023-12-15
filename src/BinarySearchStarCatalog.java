


public class BinarySearchStarCatalog{
public static void main(String[] args) {
        // Test with a small catalog
        StarCatalog smallCatalog = new StarCatalog(10);
        smallCatalog.addStar(new Star("Sirius", -1.46, 8.6));
        smallCatalog.addStar(new Star("Betelgeuse", 0.42, 640.0));
        smallCatalog.addStar(new Star("Vega", 0.03, 25.0));

        smallCatalog.displayCatalog();

        // Perform binary searches
        int index = smallCatalog.binarySearchByMagnitude(0.42);
        System.out.println("Star with magnitude 0.42 found at index: " + index);

        // Test with a longer catalog
        StarCatalog largeCatalog = new StarCatalog(50);
        largeCatalog.addStar(new Star("Alpha Centauri", 4.37, 4.37));
        largeCatalog.addStar(new Star("Proxima Centauri", 15.49, 4.37));
        largeCatalog.addStar(new Star("Rigel", 0.12, 772.0));

        // Perform binary searches
        int indexLarge = largeCatalog.binarySearchByMagnitude(15.49);
        System.out.println("Star with magnitude 15.49 found at index: " + indexLarge);
        }
        }


