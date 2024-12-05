import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  base: '/',  // 배포 환경에서 ALB 루트 경로에 맞게 설정
});
