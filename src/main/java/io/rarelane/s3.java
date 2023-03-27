package io.rarelane;

interface s3{
    // Create new bucket if non-existent
    public void createBucket();

    // Upload file to s3 bucket
    public void uploadBucket();

    // Delete file if already in s3 bucket upload new
    public void deleteBucket();

    // Search if file is already present in s3 bucket
    public void searchBucket();
}
