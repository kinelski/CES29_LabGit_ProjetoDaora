package processo;

public interface RespositorioProcessos {
	boolean addProcesso(Processo processo);
	Processo getProcesso(int id);
}
