import java.util.Arrays;

public class StarCatalog {
        private Star[] stars;
        private int size;

        public StarCatalog(int capacity) {
            this.stars = new Star[capacity];
            this.size = 0;
        }

        public void addStar(Star star) {
            if (size < stars.length) {
                stars[size++] = star;
                Arrays.sort(stars, 0, size); // maintain sorted order based on magnitude
            } else {
                System.out.println("Catalog is full. Cannot add more stars.");
            }
        }

        public void displayCatalog() {
            System.out.println("Star Catalog: ");
            for (int i = 0; i < size; i++) {
                System.out.println(stars[i]);
            }
            System.out.println();
        }

        public int binarySearchByMagnitude(double targetMagnitude) {
            int left = 0;
            int right = size - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (stars[mid].getMagnitude() == targetMagnitude) {
                    return mid; // Found at mid index
                } else if (stars[mid].getMagnitude() < targetMagnitude) {
                    left = mid + 1; // Search right half
                } else {
                    right = mid - 1; // Search left half
                }
            }

            return -1; // Not found
        }
    }

