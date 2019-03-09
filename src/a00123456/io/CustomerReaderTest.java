/**
 * Project: A00123456Lab3
 * File: CustomerReaderTest.java
 * Copyright 2017 Sam Cirka. All rights reserved.
 */

package a00123456.io;

import org.junit.Test;

import a00123456.ApplicationException;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class CustomerReaderTest {

	@Test
	public void testJoinedDate() throws ApplicationException {
		String customerData = "1|Fred|Fish|5707 Sidley St|Burnaby|V5J 5E6|(604) 433-5004|fredfish@imperial.net|20080322:2|Laurie|Nash|2816 Commercial Dr|Vancouver|V5N 4C6|(604) 876-0182|laurieeenash@modern.com|20140828:3|Conrad|Washington|13479 King George Blvd|Surrey|V3T 2T8|(604) 588-4988|cwash@daytona.net|20110712:4|Jeanette|Price|21000 Westminster Hwy|Richmond|V6V 2S9|(604) 276-2552|priceizrite@pacific.com|20151003:5|Mark|Chan|3766 E 1st Ave|Burnaby|V5C 3V9|(604) 293-1022|mchan@hcenter.com|20100401";
		CustomerReader.read(customerData);
	}

	@Test(expected = ApplicationException.class)
	public void testIncorrrectNumberOfParameters() throws ApplicationException {
		String customerData = "1|Fred|Fish|5707 Sidley St|Burnaby|V5J 5E6|(604) 433-5004|20080322:2|Laurie|Nash|2816 Commercial Dr|Vancouver|V5N 4C6|(604) 876-0182|laurieeenash@modern.com|20140828:3|Conrad|Washington|13479 King George Blvd|Surrey|V3T 2T8|(604) 588-4988|cwash@daytona.net|20110712:4|Jeanette|Price|21000 Westminster Hwy|Richmond|V6V 2S9|(604) 276-2552|priceizrite@pacific.com|20151003:5|Mark|Chan|3766 E 1st Ave|Burnaby|V5C 3V9|(604) 293-1022|mchan@hcenter.com|20100401";
		CustomerReader.read(customerData);
	}

	@Test(expected = ApplicationException.class)
	public void testBadEmailAddress() throws ApplicationException {
		String customerData = "1|Fred|Fish|5707 Sidley St|Burnaby|V5J 5E6|(604) 433-5004|fredfish|20080322:2|Laurie|Nash|2816 Commercial Dr|Vancouver|V5N 4C6|(604) 876-0182|laurieeenash@modern.com|20140828:3|Conrad|Washington|13479 King George Blvd|Surrey|V3T 2T8|(604) 588-4988|cwash@daytona.net|20110712:4|Jeanette|Price|21000 Westminster Hwy|Richmond|V6V 2S9|(604) 276-2552|priceizrite@pacific.com|20151003:5|Mark|Chan|3766 E 1st Ave|Burnaby|V5C 3V9|(604) 293-1022|mchan@hcenter.com|20100401";
		CustomerReader.read(customerData);
	}

	@Test(expected = ApplicationException.class)
	public void testBadJoinedDate() throws ApplicationException {
		String customerData = "1|Fred|Fish|5707 Sidley St|Burnaby|V5J 5E6|(604) 433-5004|fredfish@imperial.net|0:2|Laurie|Nash|2816 Commercial Dr|Vancouver|V5N 4C6|(604) 876-0182|laurieeenash@modern.com|20140828:3|Conrad|Washington|13479 King George Blvd|Surrey|V3T 2T8|(604) 588-4988|cwash@daytona.net|20110712:4|Jeanette|Price|21000 Westminster Hwy|Richmond|V6V 2S9|(604) 276-2552|priceizrite@pacific.com|20151003:5|Mark|Chan|3766 E 1st Ave|Burnaby|V5C 3V9|(604) 293-1022|mchan@hcenter.com|20100401";
		CustomerReader.read(customerData);
	}

	@Test(expected = ApplicationException.class)
	public void testBadMonth() throws ApplicationException {
		String customerData = "1|Fred|Fish|5707 Sidley St|Burnaby|V5J 5E6|(604) 433-5004|fredfish@imperial.net|20080399:2|Laurie|Nash|2816 Commercial Dr|Vancouver|V5N 4C6|(604) 876-0182|laurieeenash@modern.com|20140828:3|Conrad|Washington|13479 King George Blvd|Surrey|V3T 2T8|(604) 588-4988|cwash@daytona.net|20110712:4|Jeanette|Price|21000 Westminster Hwy|Richmond|V6V 2S9|(604) 276-2552|priceizrite@pacific.com|20151003:5|Mark|Chan|3766 E 1st Ave|Burnaby|V5C 3V9|(604) 293-1022|mchan@hcenter.com|20100401";
		CustomerReader.read(customerData);
	}

}
