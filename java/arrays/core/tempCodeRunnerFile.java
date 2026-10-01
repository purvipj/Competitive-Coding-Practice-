int p=0;
        for(int i=0;i<n-1;i+=2){
            nums[i]=pos[p];
            nums[i+1]=neg[p];
            p++;
        }