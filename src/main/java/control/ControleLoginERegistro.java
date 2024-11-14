package control;

public class ControleLoginERegistro implements ILoginERegistro {
	
    // Lembrar de usar @Override
    @Override
	  public void registro() {

      } 

   @Override
	 public boolean validarSenha(){
        return true;
      }

   @Override
	 public void login(){

      }

    @Override
     public boolean validarEmail(){
        return true;

      }

}
