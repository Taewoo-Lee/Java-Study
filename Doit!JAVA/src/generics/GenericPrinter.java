package generics;

class GenericPrinter<T> {
	private T metarial;

	public T getMetarial() {
		return metarial;
	}

	public void setMetarial(T metarial) {
		this.metarial = metarial;
	}

	@Override
	public String toString() {
		return metarial.toString();
	}
}
