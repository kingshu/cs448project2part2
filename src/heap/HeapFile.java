class HeapFile implements Filetype, GlobalConst {
	
    // Initialize.  A null name produces a temporary heapfile which will be
    // deleted by the destructor.  If the name already denotes a file, the
    // file is opened; otherwise, a new empty file is created.
    HeapFile(String name) throws HFException, HFBufMgrException, HFDiskMgrException, IOException {

    }
   
	// Delete the file from the database.
	public void deleteFile() throws InvalidSlotNumberException, FileAlreadyDeletedException, InvalidTupleSizeException, HFBufMgrException, HFDiskMgrException, IOException {

	}
	
	// Delete record from file with given rid.
	public boolean deleteRecord(RID rid) throws InvalidSlotNumberException, InvalidTupleSizeException, HFException, HFBufMgrException, HFDiskMgrException, Exception {

		return false;
	}
	
	// Return number of records in file.
	 public int getRecCnt() throws InvalidSlotNumberException, InvalidTupleSizeException, HFDiskMgrException, HFBufMgrException, IOException {

		return 0;
	}
	
	// Read record from file, returning pointer and length.
	public Tuple getRecord(RID rid) throws InvalidSlotNumberException, InvalidTupleSizeException, HFException, HFDiskMgrException, HFBufMgrException, Exception {

		return new Tuple();
	}
	
	/* Insert record into file, return its Rid.
	 * @param recPtr - pointer of the record
	 * @param recLen - the length of the record
	*/
	public RID insertRecord(byte recPtr[], int recLen) throws InvalidSlotNumberException, InvalidTupleSizeException, SpaceNotAvailableException, HFException, HFBufMgrException, HFDiskMgrException, IOException {

		return new RID();
	}
	
	// Initiate a sequential scan.
	public Scan openScan() throws InvalidTupleSizeException, IOException {

		return new Scan();
	}

	// Updates the specified record in the heapfile.
	public boolean updateRecord(RID rid, Tuple newtuple) throws InvalidSlotNumberException, InvalidUpdateException, InvalidTupleSizeException, HFException, HFDiskMgrException, HFBufMgrException, Exception {

		return false;
	}

}