package SapteB;

public class Program {
    public static void main(String[] args){

NotaDePlata notaDePlata=new NotaDePlata(55);
notaDePlata.printeaza();

DecoratorAbstract decoratorLaMultiAni=new DecoratorCuLaMultiAni(notaDePlata);

decoratorLaMultiAni.printeazaFelicitare();
        System.out.println();
decoratorLaMultiAni.printeaza();

DecoratorAbstract decoratorPaste=new DecoratorUrarePaste(notaDePlata);
decoratorPaste.printeaza();
        System.out.println();

NotaDePlata notaDePlata1=new NotaDePlata(150);
DecoratorAbstract decoratorLaMultiAniDePaste=new DecoratorCuLaMultiAni(notaDePlata1);
DecoratorAbstract decoratorUrarePaste2=new DecoratorUrarePaste(decoratorLaMultiAniDePaste);
decoratorUrarePaste2.printeaza();

    }
}
