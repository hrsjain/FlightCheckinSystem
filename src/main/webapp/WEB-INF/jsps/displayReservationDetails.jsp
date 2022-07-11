<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details:</h2>

Airlines: ${reservation.flight.operatingAirlines}
Flight Number: ${reservation.flight.flightNumber}
Departure City; ${reservation.flight.departureCity}
Arrival City: ${reservation.flight.arrivalCity}
Departure Date: ${reservation.flight.departureDate}
Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}



<h2>Passenger Details:</h2>


First Name:${reservation.passenger.firstName}
Last Name: ${reservation.passenger.lastName}
Middle Name: ${reservation.passenger.middleName}
Email: ${reservation.passenger.email}
Phone: ${reservation.passenger.phone}

<form action="completeCheckIn" method="post">
Enter the Number of Bags You want to CheckIn: <input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check In"/>

</form>
</body>
</html>