import java.util.*;

public class maxFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,3,4,5};

        List<ElementFrequency> elementFrequencies = new ArrayList<>();

        for (int num : arr) {
            boolean found = false;
            for (ElementFrequency ef : elementFrequencies) {
                if (ef.element == num) {
                    ef.frequency++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                elementFrequencies.add(new ElementFrequency(num, 1));
            }
        }

        Collections.sort(elementFrequencies, (a, b) -> b.frequency - a.frequency);

        System.out.println("Sorted Array (Decreasing Order of Frequency):");
        for (ElementFrequency ef : elementFrequencies) {
            int element = ef.element;
            int frequency = ef.frequency;
            for (int i = 0; i < frequency; i++) {
                System.out.print(element + " ");
            }
        }
    }

    static class ElementFrequency {
        int element;
        int frequency;

        ElementFrequency(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }
}
