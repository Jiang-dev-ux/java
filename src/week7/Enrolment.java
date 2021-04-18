package week7;

class Enrolment {
	private SubjectList list[];
	private int nCount;

	Enrolment(int max) {
		list = new SubjectList[max];
		nCount = 0;
	}
	
	public int found(String ID) {
		int index = -1;
		for (int i = 0; i < list.length && list[i] != null; i++)
			if (ID.equals(list[i].getSubject().getSubjectID()))
				index = i;
		return index;
	}
	
	public boolean remove(String ID) {
		int index = found(ID);
		if (index != -1)
			for (int j = index; j < list.length-1 && list[j] != null; j++)
				list[j] = list[j + 1];
		nCount--;
		return true;
	}
	
	public SubjectList[] getList() {
		return list;
	}

	public boolean boolName(String Name) {
		for (int i = 0; i < list.length && list[i] != null; i++)
			if (Name.equals(list[i].getSubject().getSubjectName()))
				return true;
		return false;
	}
	
	public boolean boolID(String ID) {
		for (int i = 0; i < list.length && list[i] != null; i++)
			if (ID.equals(list[i].getSubject().getSubjectID()))
				return true;
		return false;
	}
	
	public boolean add(SubjectList S) {
		if (nCount >= list.length)
			return false;
		if (S == null)
			return false;
		list[nCount] = S;
		nCount++;
		return true;
	}
	
	public String toString() {
		String msg = "================================\n";
		for(int i = 0; i < nCount && list[i] != null; i++)
			msg += list[i].toString();
		return msg;
	}  

}
