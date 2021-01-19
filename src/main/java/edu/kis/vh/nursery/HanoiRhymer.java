package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > getNumber())
		totalRejected++;
	else
		super.countIn(in);
	}
}


// kombinacja klawiszowa alt + ->/<-   pozwala na przeskakiwanie po otwartych plikach