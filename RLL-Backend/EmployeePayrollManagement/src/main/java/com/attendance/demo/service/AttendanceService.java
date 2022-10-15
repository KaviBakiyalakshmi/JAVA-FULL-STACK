package com.attendance.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.demo.entity.Attendance;
import com.attendance.demo.repo.AttendanceRepo;

@Service
public class AttendanceService {
	
	
		@Autowired
		private AttendanceRepo repo;
		
		public Attendance addAttendance(Attendance u) {
			return repo.save(u);
		}
		public List<Attendance> getAllAttendance(){
			return repo.findAll();
		}
		public Attendance getAttendanceById(long id) {
			if(repo.findById(id).isPresent()) {
				return repo.findById(id).get();
			}
			else {
				return null;
			}
			
		}
		public Attendance updateAttendance(long id, Attendance newAttendance) {
			if(repo.findById(id).isPresent()) {
				Attendance olduser= repo.findById(id).get();
				olduser.setName(newAttendance.getName());
				olduser.setStarttime(newAttendance.getStarttime());
				olduser.setEndtime(newAttendance.getEndtime());
				olduser.setDate(newAttendance.getDate());
				olduser.setStatus(newAttendance.getStatus());
				
				return repo.save(olduser);
			}
			else {
				return null;
			}
		}
		
		
		public boolean deleteAttendance(long id) {
			if(repo.findById(id).isPresent()) {
				repo.deleteById(id);
				return true;
			}
			
			else {
				return false;
			}
		}
		
	}


