package notebooks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Dell", 8, 500, "Windows", "Black"));
        notebooks.add(new Notebook("HP", 16, 1000, "Windows", "Silver"));
        notebooks.add(new Notebook("Apple", 8, 256, "macOS", "Gray"));
        notebooks.add(new Notebook("Lenovo", 4, 500, "Windows", "Black"));
        notebooks.add(new Notebook("Asus", 16, 512, "Windows", "Blue"));

        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "ram");
        criteriaMap.put(2, "hdd");
        criteriaMap.put(3, "os");
        criteriaMap.put(4, "color");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        criteriaMap.forEach((k, v) -> System.out.println(k + " - " + v));

        List<Integer> selectedCriteria = new ArrayList<>();
        List<String> criteriaValues = new ArrayList<>();

        while (true) {
            System.out.println("Введите номер критерия (или 0 для завершения):");
            int criterion = scanner.nextInt();
            if (criterion == 0) break;
            selectedCriteria.add(criterion);

            System.out.println("Введите минимальное значение для критерия " + criteriaMap.get(criterion) + ":");
            String value = scanner.next();
            criteriaValues.add(value);
        }

        NotebookFilter.filterNotebooks(notebooks, selectedCriteria, criteriaValues, criteriaMap);
    }
}