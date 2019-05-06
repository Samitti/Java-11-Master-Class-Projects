public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;


        for (int i = 1; i <= bigCount; i++) {

            if ((i * 5) == goal) return true;
            else if ((i * 5) < goal) {
                if (((i * 5) + smallCount) >= goal) return true;
            }

        }

        if (smallCount >= goal) return true;
        return false;
    }
}
