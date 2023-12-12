package Lista11_Herança.Exe05;

public class Smartphone extends Computador {

	private int operadora;
	private boolean cameraDeVideo;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraDeVideo) {
		super(modelo, ram, armazenamento);
		setOperadora(operadora);
		setCameraDeVideo(cameraDeVideo);
	}

	public int getOperadora() {
		return operadora;
	}

	public void setOperadora(int operadora) throws IllegalArgumentException {
		if (operadora < 0) {
			throw new IllegalArgumentException("Operadora inválida");
		}
		this.operadora = operadora;
	}

	public boolean isCameraDeVideo() {
		return cameraDeVideo;
	}

	public void setCameraDeVideo(boolean cameraDeVideo) {
		this.cameraDeVideo = cameraDeVideo;
	}

	@Override
	public boolean rodarAplicacao() {
		return true;
	}

	@Override
	public String toString() {
		String str = super.toString() + "\nOperadora: " + getOperadora();
		
		if (cameraDeVideo) {
			str += "Possui câmera de vídeo";
		} else {
			str += "Não possui câmera de vídeo";
		}
		
		if (rodarAplicacao()) {
			str += "\nRodar aplicação";
		} else { 
			str += "\nNão rodar aplicação";
		}
	return str;
	}
}
