package in.co.decimal.consumer;

import java.util.List;
import java.util.logging.Logger;

import in.co.decimal.sorting.util.MySortingUtil;


public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtil.class.getName());

	public static void main(String[] args) {
		MySortingUtil mySortingUtil = new MySortingUtil();
		List<String> sortedList = mySortingUtil.sort(List.of("Vikas", "Basant", "Kumar", "Prince"));
		logger.info(sortedList.toString());
	}
}
