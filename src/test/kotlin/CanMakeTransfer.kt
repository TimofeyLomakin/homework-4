import org.junit.Test

import org.junit.Assert.*
 class CanMakeTransfer {

  @Test
  fun canMakeTransferYes() {
   val typeCard = "Mastercard"
   val transferPerMonth = 0
   val transferSum = 150_000

   val result = ru.netology.canMakeTransfer(transferSum, transferPerMonth, typeCard)
   assertEquals("Операция проведена успешно, комиссия составила: 470 руб", result)
  }

@Test
 fun canMakeTransferNo() {
 val typeCard = "Mastercard"
 val transferPerMonth = 0
 val transferSum = 150_001

 val result = ru.netology.canMakeTransfer(transferSum, transferPerMonth, typeCard)
 assertEquals("Операция заблокирована!", result)
 }

  @Test
  fun canMakeTransferVkPayNoFirstCondition() {
   val typeCard = "VK Pay"
   val transferPerMonth = 0
   val transferSum = 15_001

   val result = ru.netology.canMakeTransfer(transferSum, transferPerMonth, typeCard)
   assertEquals("Операция заблокирована!", result)
  }

  @Test
  fun canMakeTransferVkPayNoSecondCondition() {
   val typeCard = "VK Pay"
   val transferPerMonth = 25_001
   val transferSum = 15_000

   val result = ru.netology.canMakeTransfer(transferSum, transferPerMonth, typeCard)
   assertEquals("Операция заблокирована!", result)
  }

  @Test
  fun canMakeTransferVkPayYes() {
   val typeCard = "VK Pay"
   val transferPerMonth = 25_000
   val transferSum = 15_000

   val result = ru.netology.canMakeTransfer(transferSum, transferPerMonth, typeCard)
   assertEquals("Операция проведена успешно, комиссия составила: 0 руб", result)
  }
}