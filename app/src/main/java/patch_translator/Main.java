/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package patch_translator;

import patch_translator.translation.Translator;

public class Main {
    public static void main(String[] args) {
        String donerSrcPath = args[0];
        String donerDstPath = args[1];
        String doneePath = args[2];
        System.out.println("Doner Program Source Path: " + donerSrcPath);
        System.out.println("Doner Program Destination Path: " + donerDstPath);
        System.out.println("Donee Program Path: " + doneePath);
        Translator Translator = new Translator(donerSrcPath, donerDstPath, doneePath);
//        patchTranslator.translate();

    }
}
