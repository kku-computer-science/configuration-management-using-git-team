# กลุ่ม จะรอดมั้ย

**รายวิชา:** CP353004 Software Engineering

## สมาชิก

- นายเอกวิชญ์ พิลาวรรณ 663380619-8 (Mem1)
- นายนพชาติ น้อยนารถ 663380601-7 (Mem2)
- นางสาวพัชริดา เฟื่องอารมย์ 663380608-3 (Mem3)

## Workflow Process ของกลุ่ม

### 1. การวางแผนงาน (Planning)

ทีมประชุมเพื่อกำหนดโครงสร้างโปรเจกต์ เช่น

- โฟลเดอร์ `src/algorithms/`
- ไฟล์หลักที่ใช้ เช่น `ISortStrategy.java`, `AlgorithmRegistry.java`, `App.java`
- มาตรฐานการเขียนโค้ดและแบ่งหน้าที่ให้สมาชิกแต่ละคน

### 2. การตั้งค่าโครงโปรเจกต์ (Initial Setup − โดย Mem1)

Mem1 รับผิดชอบสร้างโครงสร้างโปรเจกต์เริ่มต้น เช่น

- `src/algorithms/ISortStrategy.java` (interface กลาง)
- `src/AlgorithmRegistry.java`
- `src/App.java`

จากนั้น Mem1 ทำการ **commit merge(เข้า main) และ push โครงสร้างขึ้นไปบน GitHub** เพื่อให้สมาชิกคนอื่นดึงไปใช้งาน

### 3. การพัฒนา (Development)

สมาชิกแต่ละคนทำงานบน branch ของตัวเอง เช่น

- **Mem2** → `mem2-branch` (เขียน `BubbleSort.java`)
- **Mem3** → `mem3-branch` (เขียน `QuickSort.java`)
  สมาชิกจะทำการ

```bash
git pull origin main
```

เพื่อดึงโครงโปรเจกต์จาก Mem1 มาพัฒนาต่อบน branch ของตัวเอง หลังเขียนอัลกอริทึมเสร็จ จะทำการ **commit → push → เปิด Pull Request**

### 4. การตรวจสอบ (Code Review)

สมาชิกช่วยกันตรวจสอบโค้ดของเพื่อนก่อน merge เพื่อให้

- โค้ดไม่ผิด logic
- ไม่มี conflict
- ตามมาตรฐานที่ตั้งไว้
  เมื่อผ่านการตรวจสอบแล้ว จะ merge เข้า main

### 5. การรวมงาน (Integration − โดย Mem1)

เมื่ออัลกอริทึมทั้ง `BubbleSort` และ `QuickSort` ถูก merge แล้ว
Mem1 จะดึง main มาปรับ branch ของตัวเอง เช่น

```bash
git checkout mem1-branch
git pull origin main
git merge main
```

จากนั้น Mem1 จะเขียนส่วนของ

- รับ input จากผู้ใช้
- เลือก algorithm
- เรียกใช้งานผ่าน `AlgorithmRegistry`
  แล้ว push / merge กลับเข้า main อีกครั้ง

### 6. การส่งงาน (Delivery)

ตรวจสอบความถูกต้องของเอกสารและโค้ดรวมทุกไฟล์ให้สมบูรณ์ จากนั้น Commit และ Push ขึ้น GitHub หลังจากนั้นสร้าง readme(เช่น Somsri_1234.md) ใน branch ของตัวเองจากนั้น Commit และ Push ขึ้น Github ใน branch ตัวเอง ตามรูปแบบที่อาจารย์กำหนด
