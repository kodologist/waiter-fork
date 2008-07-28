/**
 * This file is Copyright © 2008 Software Craftsmen Limited. All Rights Reserved.
 */
package com.softwarecraftsmen.dns;

import com.softwarecraftsmen.ConvenientArrayList;
import static com.softwarecraftsmen.ConvenientArrayList.toList;
import static com.softwarecraftsmen.dns.SimpleLabel.Empty;
import static com.softwarecraftsmen.dns.SimpleLabel.simpleLabel;
import com.softwarecraftsmen.dns.messaging.GenericName;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.List;

public class GenericNameTest
{
	@Test
	public void toLabelsMatchesExactStructure()
	{
		final List<Label> labels = new GenericName(toList(simpleLabel("www"), simpleLabel("google"), simpleLabel("com"), Empty)).toLabels();
		final List<Label> actual = new ConvenientArrayList<Label>(simpleLabel("www"), simpleLabel("google"), simpleLabel("com"), Empty);
		assertThat(actual, equalTo(labels));
	}
}
