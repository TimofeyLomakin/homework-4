package ru.netology

fun main() {

    val typeCard = "Mastercard"
    val transferPerMonth = 0
    val transferSum = 200

    println(canMakeTransfer(transferSum, transferPerMonth, typeCard))
}

fun canMakeTransfer(transferSum: Int, transferPerMonth: Int, typeCard: String): String {
    val limitTransferPerDay = 150_000
    val limitTransferPerMonth = 600_000
    val limitTransferPerDayForVK = 15_000
    val limitTransferPerMonthForVK = 40_000

    if (limitTransferPerDay >= transferSum && limitTransferPerMonth >= transferPerMonth + transferSum && typeCard!= "VK Pay") {
        return "Операция проведена успешно, комиссия составила: " + transfer(typeCard, transferPerMonth, transferSum) + " руб"
    } else if (typeCard == "VK Pay" && (limitTransferPerDayForVK >= transferSum && limitTransferPerMonthForVK >= transferPerMonth + transferSum)) {
        return "Операция проведена успешно, комиссия составила: " + transfer(typeCard, transferPerMonth, transferSum) + " руб"
    } else {
        return "Операция заблокирована!"
    }
}

fun transfer(typeCard: String, transferPerMonth: Int, transferSum: Int): Int {
    when (typeCard) {

        "Mastercard" -> return commissionMastercardAndMaestro(transferPerMonth, transferSum)

        "Maestro" -> return commissionMastercardAndMaestro(transferPerMonth, transferSum)

        "Visa" -> return commissionVisaAndMir (transferSum)

        "Мир" -> return commissionVisaAndMir (transferSum)

    }
    return 0
}

fun commissionVisaAndMir (transferSum: Int): Int {
    val commissionVisa = 0.0075
    val minCommission = 35
    if (transferSum * commissionVisa < minCommission) {
        return minCommission
    } else {
        return (transferSum * commissionVisa).toInt()
    }
}

fun commissionMastercardAndMaestro (transferPerMonth: Int, transferSum: Int): Int {
    val commissionMastercard = 0.006
    val addCommissionMastercard = 20
    val maxSumNonCommissionMastercard = 75_000
    val minTransferSum = 300
    if (transferSum < minTransferSum) {
        return (transferSum * commissionMastercard).toInt() + addCommissionMastercard
    } else if (transferSum + transferPerMonth <= maxSumNonCommissionMastercard) {
        return 0
    } else if (maxSumNonCommissionMastercard - transferPerMonth >= 0) {
        return ((transferSum + transferPerMonth - maxSumNonCommissionMastercard) * commissionMastercard).toInt() + addCommissionMastercard
    } else {
        return (transferSum * commissionMastercard).toInt() + addCommissionMastercard
    }
}
