package org.fundacionjala.coding.norman.kata1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Test kata2.
 */
public class Task1Test {

        /**
         * Test when the EAN string number checksum is different from 0.
         */
        @Test
        public void testValidateTheCheckSumIsDifferentFromZero() {
            // given:
            final String eanStringNumber = "4003301018398";

            // when:
            final boolean actualResult = Task1.validate(eanStringNumber);

            // then:
            assertTrue(actualResult);
        }

        /**
         * Test when the EAN string number checksum is equal to 0.
         */
        @Test
        public void testValidateTheCheckSumIsEqualToZero() {
            // given:
            final String eanStringNumber = "4003301018392";

            // when:
            final boolean actualResult = Task1.validate(eanStringNumber);

            // then:
            assertTrue(!actualResult);
        }
    }


