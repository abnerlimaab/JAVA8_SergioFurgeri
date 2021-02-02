package cap11;

import java.io.File;

public class ExcluiDiretorio {
    public static void main(String[] args) {
        File dir = new File("c:/loja");
        String men = "";
        if (dir.isDirectory()) {
            if (dir.delete()) men = dir.getName() + " Excluído com sucesso";
            else {
                if (excluirFilhos(dir)) men = dir.getName() + " Excluído com sucesso";
                else men = "Falha na exclusão de " + dir.getName();
            }
            System.out.println(men);
        }
    }

    private static boolean excluirFilhos(File dir) {
        if (dir.isDirectory()) {
            String[] arquivos = dir.list();
            for (String arquivo : arquivos) {
                boolean success = excluirFilhos(new File(dir, arquivo));
                if (success) System.out.println("Excluído: " + arquivo);
                else {
                    System.out.println(arquivo + " não pode ser excluído.");
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
