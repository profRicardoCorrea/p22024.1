package entidades.enums;

public enum SerieTimesEnum {
	A("S�rie A"),B("S�rie B"),C("S�rie C"),D("S�rie D");
	
	private String descricao;
		
	SerieTimesEnum(String descricao) {
			this.descricao = descricao;
		}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static SerieTimesEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (SerieTimesEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
