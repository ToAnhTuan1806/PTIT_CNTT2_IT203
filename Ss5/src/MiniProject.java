import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu chinh cua chuong trinh
        while (true) {
            printMenu();
            System.out.print("Nhap lua chon (1-5 hoac 0 de thoat): ");

            if (sc.hasNextInt() == false) {
                System.out.println("Lua chon khong hop le! Vui long nhap so.");
                sc.next(); // bo input sai
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // bo ky tu xuong dong

            switch (choice) {
                case 0: {
                    System.out.println("Tam biet! Hen gap lai.");
                    return;
                }
                case 1: {
                    twoSum(sc);
                    break;
                }
                case 2: {
                    moveZeroes(sc);
                    break;
                }
                case 3: {
                    validPalindrome(sc);
                    break;
                }
                case 4: {
                    reverseWords(sc);
                    break;
                }
                case 5: {
                    happyNumber(sc);
                    break;
                }
                default: {
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
                    break;
                }
            }
        }
    }

    // In menu
    private static void printMenu() {
        System.out.println("\n=====================================");
        System.out.println("     MINI PROJECT - THUAT TOAN CO BAN    ");
        System.out.println("=====================================");
        System.out.println("1. Two Sum (Tim cap so co tong = target)");
        System.out.println("2. Move Zeroes (Don so 0 ve cuoi mang)");
        System.out.println("3. Valid Palindrome (Kiem tra chuoi doi xung)");
        System.out.println("4. Reverse Words in a String (Dao nguoc tu trong cau)");
        System.out.println("5. Happy Number (So hanh phuc)");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("=====================================");
    }

    // 1. Two Sum
    // Tim cap chi so i, j sao cho nums[i] + nums[j] = target
    private static void twoSum(Scanner sc) {
        System.out.println("\n=== Two Sum ===");
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            sc.nextLine();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Nhap target: ");
        int target = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(
                            "Tim thay cap: index " + i + " va " + j +
                                    " (" + nums[i] + " + " + nums[j] + " = " + target + ")"
                    );
                    return;
                }
            }
        }

        System.out.println("Khong tim thay cap so nao co tong bang " + target);
    }

    // 2. Move Zeroes
    // Don tat ca so 0 ve cuoi mang, giu nguyen thu tu cac so con lai
    // Khong su dung mang phu
    private static void moveZeroes(Scanner sc) {
        System.out.println("\n=== Move Zeroes ===");
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Mang rong.");
            sc.nextLine();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.nextLine();

        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }

        System.out.print("Mang sau khi don 0 ve cuoi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // 3. Valid Palindrome
    // Kiem tra chuoi co doi xung hay khong
    // Su dung Regex va ky thuat two pointers
    private static void validPalindrome(Scanner sc) {
        System.out.println("\n=== Valid Palindrome ===");
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        cleaned = cleaned.toLowerCase();

        if (cleaned.length() == 0) {
            System.out.println("Ket qua: True");
            System.out.println("(Sau khi lam sach: " + cleaned + ")");
            return;
        }

        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Ket qua: " + (isPalindrome == true ? "True" : "False"));
        System.out.println("(Sau khi lam sach: " + cleaned + ")");
    }

    // 4. Reverse Words in a String
    // Dao nguoc thu tu cac tu trong cau
    private static void reverseWords(Scanner sc) {
        System.out.println("\n=== Reverse Words ===");
        System.out.print("Nhap cau: ");
        String s = sc.nextLine();

        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            System.out.println("Chuoi rong -> \"\"");
            return;
        }

        String[] words = trimmed.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        System.out.println("Ket qua: \"" + result.toString() + "\"");
    }

    // 5. So hanh phuc (Happy Number)
    // Lap lai tong binh phuong cac chu so
    private static void happyNumber(Scanner sc) {
        System.out.println("\n=== Happy Number ===");
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("So phai lon hon 0.");
            return;
        }

        Set<Integer> seen = new HashSet<Integer>();
        int current = n;

        while (current != 1) {
            if (seen.contains(current) == true) {
                break;
            }
            seen.add(current);
            current = sumOfSquareDigits(current);
        }

        if (current == 1) {
            System.out.println("True - Day la so hanh phuc");
        } else {
            System.out.println("False - Khong phai so hanh phuc (vao vong lap)");
        }
    }

    // Tinh tong binh phuong cac chu so
    private static int sumOfSquareDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit;
            num = num / 10;
        }

        return sum;
    }
}
