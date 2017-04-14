package src;

public class ControladorSIAPJ {
    
    private ServiceMail servicemail;
    private RepositorioProcessos repositorio;
    private ValidadorProcessos validador;
    
    public ControladorSIAPJ(ServiceMail servicemail, ValidadorProcessos validador,
            RepositorioProcessos repositorio){
        this.servicemail = servicemail;
        this.repositorio = repositorio;
        this.validador = validador;
    }
    
    public boolean initProcesso(Processo processo){
        boolean valido = checkProcesso(processo);
        if (valido){
            persistProcesso(processo);
        }
        sendInfoByEmail(processo, valido);
        return valido;
    }
    
    private boolean checkProcesso(Processo processo){
        return validador.validateProcess(processo);
    }
    
    private Processo persistProcesso(Processo processo){
        repositorio.addProcesso(processo);
        return processo;
    }
    
    private void sendInfoByEmail(Processo processo,boolean statusProcesso){
        servicemail.sendEmail("Teste");
    }
}
