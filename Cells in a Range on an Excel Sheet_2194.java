List<String> res = new ArrayList();
        String[] points = s.split(":");
        char c1 = points[0].charAt(0);
        char r1 = points[0].charAt(1);
        char c2 = points[1].charAt(0);
        char r2 = points[1].charAt(1);
        StringBuilder sb = new StringBuilder();
        for(char c = c1; c <= c2; c++) {
            for(char r = r1; r <= r2; r++) {
                sb.append(c).append(r);
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        return res;