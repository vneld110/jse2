package oop06.lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[][] arr;
	

	@Override
	public void extractLottos(int money) {
		inputMoney(money);
		int count = this.getCount(money);
		int i = 0;
		for(count=0;count<lottos.length;count++){
			while(true){
				// ���δ� �������ּ���.
				// isDuplication() �޼ҵ� ����Ͼ� �մϴ�.
				// �ߺ����� ���� �����̸�
				// lotto[count][i]= num �� 
				// ���·� ���� �˴ϴ�.
			}
		}
	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money/1000][6];
	}

	@Override
	public int getRandomNum() {
		return (int)((Math.random()*45)+1);
	}

	@Override
	public boolean isDuplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort(int[] array) {
		for(int i=0; i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					// �ϼ��� �ּ���.
					// ���п�
					// ���� �˰��� �˻��ϸ�
					// ����
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if(money < 10000){
			return 0;
		}
		return (int) Math.ceil(money/1000);
	}

}
