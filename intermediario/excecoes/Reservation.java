package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {

	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	//CONSTRUTORES
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExceptions{
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	//GET E SET
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void uodateDates(Date checkIn, Date checkOut) throws DomainExceptions {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainExceptions("REservation dates for update must be future dates");
		}
		if (!checkOut.after(now)) {
			throw new DomainExceptions("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "  + roomNumber
				+ ", checkIn "
				+ sdf.format(checkIn)
				+ ", checkOut "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nigths. ";
	}
}
