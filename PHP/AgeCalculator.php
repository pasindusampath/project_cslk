<?php
function calculateExactAge($dob) {

    list($birthYear, $birthMonth, $birthDay) = explode('-', $dob);

    $currentYear = date('Y');
    $currentMonth = date('m');
    $currentDay = date('d');

    $years  = $currentYear - $birthYear;
    $months = $currentMonth - $birthMonth;
    $days   = $currentDay - $birthDay;

    if ($days < 0) {
        $months--;

        $prevMonth = $currentMonth - 1;
        $prevYear = $currentYear;
        if ($prevMonth == 0) {
            $prevMonth = 12;
            $prevYear--;
        }
        $daysInPrevMonth = cal_days_in_month(CAL_GREGORIAN, $prevMonth, $prevYear);
        $days += $daysInPrevMonth;
    }

    if ($months < 0) {
        $months += 12;
        $years--;
    }

    return "$years years, $months months, $days days";
}

$dob = "2000-05-15"; 
echo "Age: " . calculateExactAge($dob);
