import org.junit.Test

import org.junit.Assert.*
 class Transfer {

  @Test
  fun commissionVisaFirstCondition() {
   val typeCard = "Visa"
   val transferPerMonth = 0
   val transferSum = 10_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(75, result)
  }

  @Test
  fun commissionVisaSecondCondition() {
   val typeCard = "Visa"
   val transferPerMonth = 0
   val transferSum = 1_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(35, result)
  }

  @Test
  fun commissionMirFirstCondition() {
   val typeCard = "Мир"
   val transferPerMonth = 0
   val transferSum = 10_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(75, result)
  }

  @Test
  fun commissionMirSecondCondition() {
   val typeCard = "Мир"
   val transferPerMonth = 0
   val transferSum = 1_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(35, result)
  }

  @Test
  fun commissionMastercardFirstCondition() {
   val typeCard = "Mastercard"
   val transferPerMonth = 0
   val transferSum = 200

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(21, result)
  }

  @Test
  fun commissionMastercardSecondCondition() {
   val typeCard = "Mastercard"
   val transferPerMonth = 70_000
   val transferSum = 5_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(0, result)
  }

  @Test
  fun commissionMastercardThirdCondition() {
   val typeCard = "Mastercard"
   val transferPerMonth = 75_000
   val transferSum = 1_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(26, result)
  }

  @Test
  fun commissionMastercardFourthCondition() {
   val typeCard = "Mastercard"
   val transferPerMonth = 74_999
   val transferSum = 1_001

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(26, result)
  }

  @Test
  fun commissionMaestroFirstCondition() {
   val typeCard = "Maestro"
   val transferPerMonth = 0
   val transferSum = 200

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(21, result)
  }

  @Test
  fun commissionMaestroSecondCondition() {
   val typeCard = "Maestro"
   val transferPerMonth = 70_000
   val transferSum = 5_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(0, result)
  }

  @Test
  fun commissionMaestroThirdCondition() {
   val typeCard = "Maestro"
   val transferPerMonth = 75_000
   val transferSum = 1_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(26, result)
  }

  @Test
  fun commissionMaestroFourthCondition() {
   val typeCard = "Maestro"
   val transferPerMonth = 74_999
   val transferSum = 1_001

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(26, result)
  }

  @Test
  fun commissionVkPay() {
   val typeCard = "VKPay"
   val transferPerMonth = 10_000
   val transferSum = 1_000

   val result = ru.netology.transfer(typeCard, transferPerMonth, transferSum)

   assertEquals(0, result)
  }
}
