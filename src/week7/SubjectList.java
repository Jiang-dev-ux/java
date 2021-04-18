package week7;

class SubjectList {
	private Subject subject;
	private int capacity;
	private Student list[];
	private int nCount;

	public int getCapacity() {
		return capacity;
	}

	public int getnCount() {
		return nCount;
	}

	SubjectList(Subject subject, int capacity) {
		this.subject = subject;
		list = new Student[capacity];
		this.capacity= capacity; 
		nCount = 0;
	}

	public boolean remove(String ID) {
		int index = -1;
		for (int i = 0; i < list.length && list[i] != null; i++)
			if (ID.equals(list[i].getStudentID()))
				index = i;
		if (index != -1)
			for (int j = index; j < list.length-1 && list[j] != null; j++)
				list[j] = list[j + 1];
		else 
			return false;
		nCount--;
		capacity++;
		return true;
	}
	
	public boolean bool(String ID) {
		for (int i = 0; i < list.length && list[i] != null; i++)
			if (ID.equals(list[i].getStudentID()))
				return true;
		return false;
	}
	
	public boolean add(Student S) {
		if (nCount >= list.length)
			return false;
		if (S == null)
			return false;
		if (bool(S.getStudentID()))
			return false;
		if(capacity <= 0)
			return false;
		list[nCount] = S;
		nCount++;
		capacity--;
		return true;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public String toString() {
		String msg;
		msg = subject.toString();
		for(int i = 0; i < nCount && list[i] != null; i++)
			msg += list[i].toString();
		msg += "ÓàÁ¿£º\t" + capacity + "\n";
		msg += "================================\n";
		return msg;
	}
}
