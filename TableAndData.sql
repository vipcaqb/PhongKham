USE [PhongKham]
GO
/****** Object:  Table [dbo].[ADMININFOR]    Script Date: 12/28/2020 9:31:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ADMININFOR](
	[User] [nvarchar](50) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[Pass] [nchar](50) NULL,
 CONSTRAINT [PK_ADMININFOR] PRIMARY KEY CLUSTERED 
(
	[User] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Doctor]    Script Date: 12/28/2020 9:31:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Doctor](
	[DoctorID] [int] IDENTITY(1,1) NOT NULL,
	[DoctorName] [nvarchar](50) NULL,
	[Address] [nvarchar](255) NULL,
	[PhoneNumber] [nvarchar](50) NULL,
 CONSTRAINT [PK_Doctor] PRIMARY KEY CLUSTERED 
(
	[DoctorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Examine]    Script Date: 12/28/2020 9:31:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Examine](
	[PatientID] [int] NOT NULL,
	[DoctorID] [int] NOT NULL,
	[ExamineDate] [date] NOT NULL,
	[Result] [nvarchar](500) NULL,
	[Treatments] [nvarchar](500) NULL,
 CONSTRAINT [PK_Examine] PRIMARY KEY CLUSTERED 
(
	[PatientID] ASC,
	[DoctorID] ASC,
	[ExamineDate] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Patient]    Script Date: 12/28/2020 9:31:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Patient](
	[PatientID] [int] IDENTITY(1,1) NOT NULL,
	[PatientName] [nvarchar](50) NULL,
	[Sex] [int] NULL,
	[BirthDay] [date] NULL,
	[Address] [nvarchar](255) NULL,
	[PhoneNumber] [nvarchar](50) NULL,
 CONSTRAINT [PK_Patient] PRIMARY KEY CLUSTERED 
(
	[PatientID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ADMININFOR] ([User], [Name], [Pass]) VALUES (N'admin', N'QTV', N'123                                               ')
GO
SET IDENTITY_INSERT [dbo].[Doctor] ON 

INSERT [dbo].[Doctor] ([DoctorID], [DoctorName], [Address], [PhoneNumber]) VALUES (1, N'Dr Hoang', N'Quảng BÌnh', N'0123')
INSERT [dbo].[Doctor] ([DoctorID], [DoctorName], [Address], [PhoneNumber]) VALUES (2, N'Dr Dũng', N'Huế', N'999')
INSERT [dbo].[Doctor] ([DoctorID], [DoctorName], [Address], [PhoneNumber]) VALUES (5, N'xxxx', N'xxx', N'xx')
SET IDENTITY_INSERT [dbo].[Doctor] OFF
GO
INSERT [dbo].[Examine] ([PatientID], [DoctorID], [ExamineDate], [Result], [Treatments]) VALUES (1, 1, CAST(N'2000-06-04' AS Date), N'Sot xuat huyet', N'tiem vacine')
INSERT [dbo].[Examine] ([PatientID], [DoctorID], [ExamineDate], [Result], [Treatments]) VALUES (1, 1, CAST(N'2019-03-03' AS Date), N'khong sao', N'khong can')
INSERT [dbo].[Examine] ([PatientID], [DoctorID], [ExamineDate], [Result], [Treatments]) VALUES (2, 2, CAST(N'2009-05-05' AS Date), N'benh nag', N'abc')
INSERT [dbo].[Examine] ([PatientID], [DoctorID], [ExamineDate], [Result], [Treatments]) VALUES (3, 2, CAST(N'2010-06-07' AS Date), N'tieu duong', N'xyz')
GO
SET IDENTITY_INSERT [dbo].[Patient] ON 

INSERT [dbo].[Patient] ([PatientID], [PatientName], [Sex], [BirthDay], [Address], [PhoneNumber]) VALUES (1, N'Văn Hòa', 1, CAST(N'2020-04-05' AS Date), N'Huế', N'02223')
INSERT [dbo].[Patient] ([PatientID], [PatientName], [Sex], [BirthDay], [Address], [PhoneNumber]) VALUES (2, N'Thái Dũng', 1, CAST(N'2020-04-05' AS Date), N'qb', N'2222')
INSERT [dbo].[Patient] ([PatientID], [PatientName], [Sex], [BirthDay], [Address], [PhoneNumber]) VALUES (3, N'Hồng Hải', 0, CAST(N'2000-05-02' AS Date), N'Đn', N'999')
SET IDENTITY_INSERT [dbo].[Patient] OFF
GO
ALTER TABLE [dbo].[Examine]  WITH CHECK ADD  CONSTRAINT [FK_Examine_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Examine] CHECK CONSTRAINT [FK_Examine_Doctor]
GO
ALTER TABLE [dbo].[Examine]  WITH CHECK ADD  CONSTRAINT [FK_Examine_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Examine] CHECK CONSTRAINT [FK_Examine_Patient]
GO
