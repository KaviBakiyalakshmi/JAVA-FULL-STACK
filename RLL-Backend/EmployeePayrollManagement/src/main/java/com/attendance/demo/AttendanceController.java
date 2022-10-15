package com.attendance.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.demo.entity.Attendance;
import com.attendance.demo.service.AttendanceService;


//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/attendance")

public class AttendanceController {
	
		
		
		@Autowired
		private AttendanceService service;
		
		@PostMapping("/")
		public ResponseEntity<Attendance> adduser(@RequestBody Attendance u){
			
			Attendance attendance= service.addAttendance(u);
			
			if(attendance!=null)
				return new ResponseEntity<Attendance>(attendance,HttpStatus.CREATED);
			else
				return new ResponseEntity<Attendance>(attendance,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
		@GetMapping("/")
		public List<Attendance> getAllAttendance(){
			return service.getAllAttendance();
		}
		
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Attendance>getAttendanceById (@PathVariable int id){
			Attendance attendance= service.getAttendanceById(id);
			
			if(attendance!=null)
				return new ResponseEntity<Attendance>(attendance, HttpStatus.FOUND);
			else
				return new ResponseEntity<Attendance>(attendance, HttpStatus.NOT_FOUND);
		}
		
		
		@PutMapping("/{id}")
		public ResponseEntity<Object> updateAttendance(@PathVariable int id,@RequestBody Attendance newAttendance){
			Attendance attendance= service.updateAttendance(id, newAttendance);
			
			if (attendance!=null)
				return new ResponseEntity<Object>(attendance,HttpStatus.OK);
			else
				return new ResponseEntity<Object>("Attendance is not Available to Update",HttpStatus.NOT_FOUND);
		}
		
		
		@DeleteMapping("/{id}")
		public ResponseEntity<String>deleteAttendance(@PathVariable int id){
			boolean result = service.deleteAttendance(id);
			if(result) 
				return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
			else
				return new ResponseEntity<String>("NO user Found", HttpStatus.NOT_FOUND);
			
		}
	 
	}


