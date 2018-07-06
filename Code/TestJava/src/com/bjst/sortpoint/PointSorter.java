package com.bjst.sortpoint;

import java.util.Collections;
import java.util.List;

public class PointSorter implements Sortable {

	public List sortPoint(List list) {
		Collections.sort(list);
		return list;
	}
}
